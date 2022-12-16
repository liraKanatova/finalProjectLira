import enums.Gender;
import enums.Genre;
import enums.Language;
import model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NegativeNumberException, UniqueConstraintException, BadRequestException {

        // Бардык Id лер уникальный болуш керек. Эгер уникальный болбосо озубуз тузгон UniqueConstraintException класс ыргытсын.
        // User дин email адресси уникальный болуш керек жана @ болуусу керек. Эгер уникальный болбосо UniqueConstraintException класс,
        // @ болбосо озубуз тузгон BadRequestException класс ыргытсын.
        // User дин телефон номери +996 дан башталып 13 символдон турсун. Болбосо BadRequestException класс ыргытсын.
        // Китептин баасы терс сан болбошу керек. Болбосо NegativeNumberException ыргытсын.
        // Китептин чыккан жылы келечек убакыт болбошу керек.Болбосо DateTimeException ыргытсын.
        // Китептин автору бош болбошу керек. Болбосо EmptyStackException ыргытсын.
        List<Book>books=new ArrayList<>();

        Book book1=new Book(222222,"Zabeg v nebesa", Genre.HISTORICAL, BigDecimal.valueOf(700), Language.RUSSIAN, LocalDate.of(2020,8,12));
        Book book2=new Book(333333,"Think and get rich", Genre.HISTORICAL, BigDecimal.valueOf(1000), Language.RUSSIAN, LocalDate.of(2019,10,20));
        Book book3=new Book(444444,"21 lessons for the 21 century", Genre.FANTASY, BigDecimal.valueOf(800), Language.RUSSIAN, LocalDate.of(2020,8,12));
        Book book4=new Book(555555,"The subconscious mind can do everything", Genre.HISTORICAL, BigDecimal.valueOf(900), Language.ENGLISH, LocalDate.of(2018,5,24));
        Book book5=new Book(666666,"Lunnai trupa", Genre.ROMANCE, BigDecimal.valueOf(600), Language.ENGLISH, LocalDate.of(2015,10,20));
        List<Book>bookList=new ArrayList<>(Arrays.asList(book1,book2,book3,book4,book5));

        List<User>users=new ArrayList<>();
        User user1=new User(22222L,"Alex","Alexi","Alex_@gmail","1234", Gender.MALE,BigDecimal.valueOf(1000),books);
        User user2=new User(33333L,"Inna","Innan","Inna_@gmail","1235", Gender.FEMALE,BigDecimal.valueOf(1500),books);
        User user3=new User(44444L,"Asia","Asian","Asia_@gmail","1236", Gender.FEMALE,BigDecimal.valueOf(1300),books);
        User user4=new User(55555L,"Nik","Nika","Nik_@gmail","1237", Gender.MALE,BigDecimal.valueOf(1700),books);
        User user5=new User(66666L,"Sara","Saran","Sara_@gmail","1237", Gender.FEMALE,BigDecimal.valueOf(1600),books);
        List<User>userList=new ArrayList<>(Arrays.asList(user1,user2,user3,user4,user5));


    }
}