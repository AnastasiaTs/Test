/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sql;

/**
 *
 * @author artyom
 */
public class Main {
    public static void main(String[] args)
    {
        String[] rez = new String[20];
        Sql sql = new Sql();
        rez = sql.listStreet();
        for(int i = 0; i < 11; i++)
        {
            System.out.println("*********" + rez[i]);
        }
    }
   
}
