package com.exam.ex04;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BoardTO to = new BoardTO();
        to.setSeq(1);
        to.setSubject("제목");
        
        System.out.println(to.getSeq());
        System.out.println(to.getSubject());
    }
}
