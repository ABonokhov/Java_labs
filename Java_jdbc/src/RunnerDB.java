import java.sql.*;

public class RunnerDB {
    public static final String USER_NAME = "root";
    public static final String PASSWORD = "trojan228";
    public static final String URL = "jdbc:mysql://localhost:3306/mydb";
    public static Statement statement;
    public static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }

    static {
        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) throws ClassCastException, SQLException, ClassNotFoundException {


        Class.forName("com.mysql.cj.jdbc.Driver");
        //statement.executeUpdate("CREATE TABLE IF NOT EXISTS Actors (idActors INT NOT NULL AUTO_INCREMENT, ActorsFullName VARCHAR(45) NOT NULL, ActorsBirthday DATE NOT NULL, PRIMARY KEY (idActors))");
        //statement.executeUpdate("INSERT INTO Actors (idActors, ActorsFullName, ActorsBirthday) VALUES ('1', 'Марк Уолберг', '2001.01.31')");
        //statement.executeUpdate("UPDATE Actors  SET ActorsFullName = 'Райан Гослинг' where idActors = '6'");
        //statement.executeUpdate("INSERT INTO Actors (idActors, ActorsFullName, ActorsBirthday) VALUES ('2', 'Джейсон Стэтхем', '1996.03.19')");
        //statement.executeUpdate("INSERT INTO Actors (idActors, ActorsFullName, ActorsBirthday) VALUES ('3', 'Марго Робби', '1982.10.08')");
        //statement.executeUpdate("INSERT INTO Actors (idActors, ActorsFullName, ActorsBirthday) VALUES ('5', 'Том Харди', '1984.09.30')");
        //statement.executeUpdate("INSERT INTO Actors (idActors, ActorsFullName, ActorsBirthday) VALUES ('6', 'Том Холланд', '1999.12.22')");

        ResultSet resultSet = statement.executeQuery("SELECT * FROM Actors"); // отобразить содержимое таблицы Актеры
        System.out.println("Table Actors");

        while (resultSet.next()) {
            System.out.println(resultSet.getInt("idActors") + " " + resultSet.getString("ActorsFullName") + " " + resultSet.getString("ActorsBirthday"));


        }
        System.out.println("------------------------");


        System.out.println("Table Producers");
        //statement.executeUpdate("CREATE TABLE IF NOT EXISTS Producers (ProducersId INT NOT NULL AUTO_INCREMENT, ProducersFullName VARCHAR(45) NOT NULL, ProducersBirthday DATE NOT NULL, PRIMARY KEY (ProducersId))");
        //statement.executeUpdate("INSERT INTO Producers (ProducersId, ProducersFullName, ProducersBirthday) VALUES ('1', 'Квентин Тарантино', ' 1974.04.19')");
        //statement.executeUpdate("UPDATE Producers  SET ProducersBirthday = '1974.04.19' where ProducersId = '1'");
        //statement.executeUpdate("INSERT INTO Producers (ProducersId, ProducersFullName, ProducersBirthday) VALUES ('2', 'Гай Ричи', ' 1969.08.30')");
        //statement.executeUpdate("INSERT INTO Producers (ProducersId, ProducersFullName, ProducersBirthday) VALUES ('3', 'Кристофер Нолан', ' 1982.11.01')");
        //statement.executeUpdate("INSERT INTO Producers (ProducersId, ProducersFullName, ProducersBirthday) VALUES ('4', 'Вуди Аллен', ' 1979.12.06')");
        //statement.executeUpdate("INSERT INTO Producers (ProducersId, ProducersFullName, ProducersBirthday) VALUES ('5', 'Клинт Иствуд', ' 1962.06.28')");


        ResultSet resultSet1 = statement.executeQuery(("SELECT * FROM Producers"));  // отобразить содержимое таблицы Producers
        while (resultSet1.next()) {
            System.out.println(resultSet1.getInt("ProducersId") + " " + resultSet1.getString("ProducersFullName") + " " + resultSet1.getString("ProducersBirthday"));

        }
        System.out.println("------------------------");
        System.out.println("Table Films");

        //statement.executeUpdate("CREATE TABLE IF NOT EXISTS Films (FilmId INT NOT NULL AUTO_INCREMENT,FilmName VARCHAR(45) NOT NULL,ActorName VARCHAR(45) NOT NULL,ReleaseDate DATE NOT NULL,ReleaseCountry VARCHAR(45) NOT NULL,idActors INT NOT NULL, idProducers INT NOT NULL, PRIMARY KEY (FilmId), INDEX idActors_idx (idActors ASC) VISIBLE, INDEX idProducers_idx (idProducers ASC) VISIBLE, CONSTRAINT idActors FOREIGN KEY (idActors) REFERENCES Actors (idActors) ON DELETE CASCADE ON UPDATE CASCADE, CONSTRAINT idProducers FOREIGN KEY (idProducers) REFERENCES Producers (ProducersId) ON DELETE CASCADE ON UPDATE CASCADE)");
        //statement.executeUpdate("INSERT INTO FILMS (FilmId, FilmName, ActorName, ReleaseDate, ReleaseCountry, idActors, idProducers ) VALUES ('1', 'Однажды в Голливуде', 'Марго Робби', '2019.05.19', 'США', '3', '1' )");


        ResultSet resultSet2 = statement.executeQuery("SELECT * FROM Films"); // отобразить содержимое таблицы Films
        while (resultSet2.next()) {
            System.out.println(resultSet2.getInt("FilmId") + " " + resultSet2.getString("FilmName") + " " + resultSet2.getString("ActorName") + " " + resultSet2.getString("ReleaseDate") + " " + resultSet2.getString("ReleaseCountry") + " " + resultSet2.getInt("idActors") + " " + resultSet2.getInt("idProducers"));

        }
        System.out.println("------------------------");
        System.out.println("SQL Queries");
        ResultSet resultSet3 = statement.executeQuery("SELECT Distinct FilmName from Films where ReleaseDate >= '2019.12.31'");
        System.out.println("Фильмы, вышедшие на экран в текущем или прошлом году: ");
        while (resultSet3.next()) {
            System.out.println(resultSet3.getString("FilmName"));
        }

        System.out.println("------------------------");

        ResultSet resultSet4 = statement.executeQuery("SELECT idActors, ActorsFullName,  ProducersId, ProducersBirthday from actors,producers where ActorsFullName = ProducersFullName;");
        System.out.println(("Информация об актерах, которые были режисерами хотя бы в одном из фильмов: "));
        while (resultSet4.next()) {
            System.out.println(resultSet4.getInt(1) + " " + resultSet4.getString(2) + " " + resultSet4.getInt(3) + " " + resultSet4.getString(4));
        }

        System.out.println("------------------------");

        System.out.println(("Информация об актерах, которые снимались более чем в одном фильме: "));
        ResultSet resultSet6 = statement.executeQuery(("SELECT actorname,idActors,\n" +
                "     COUNT(*) \n" +
                "FROM\n" +
                "    films\n" +
                "GROUP BY\n" +
                "    actorname \n" +
                "    HAVING\n" +
                "COUNT(*) > 1"));
        while (resultSet6.next()) {
            System.out.println(resultSet6.getString(1) + " " + (resultSet6.getInt(2) + " " + resultSet6.getInt(3)));
        }

        System.out.println("------------------------");
        System.out.println(("Актеры, которые снимались в фильме Однажды в Голливуде: "));
        ResultSet resultSet7 = statement.executeQuery("select actorname from films where FilmName = 'Однажды в Голливуде';");
        while (resultSet7.next()) {
            System.out.println(resultSet7.getString("ActorName"));
        }

        //ResultSet resultSet5 = statement.executeQuery("SET SQL_SAFE_UPDATES = 0; Delete from Films WHERE ReleaseDate > '2021.09.14';"); // запрос на удаление фильмов дата выхода которых больше указанной даты


    }
}


