

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    public void testToStringTrue() {
        User firstUser=new User("Федор","Бабаев","babau4ik@mail.ru");
        User secondUser=new User("Кирилл","Корягин","kirill@mail.ru");
        User thirdUser=new User("Иван","Самойлов","ivan@mail.ru");
        assertEquals(3,User.totalonLine);
    }

    @Test
    public void testToStringFalse() {
        User firstUser=new User("Федор","Бабаев","babau4ik@mail.ru");
        User secondUser=new User("Кирилл","Корягин","kirill@mail.ru");
        User thirdUser=new User("Иван","Самойлов","ivan@mail.ru");
        assertEquals(5,User.totalonLine);
    }
}