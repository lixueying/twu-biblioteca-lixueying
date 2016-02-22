package com.twu.biblioteca;

import com.twu.biblioteca.User.Login;
import com.twu.biblioteca.User.User;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by lixueying on 16/2/22.
 */
public class LoginTest {
    private Login login;
    private User user;

    @Before
    public void setUp(){
        login = new Login();
    }

    @Test
    public void should_return_true_when_give_a_right_user(){
        user = new User("000-0001", "001");
        boolean flg = login.IsUser(user);
        assertThat(flg, is(true));
    }

    @Test
    public void should_return_false_when_give_a_right_user(){
        user = new User("000-0002", "001");
        boolean flg = login.IsUser(user);
        assertThat(flg, is(false));
    }
}
