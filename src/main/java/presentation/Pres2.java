package presentation;

import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        //DaoImp dao=new DaoImp()
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);//telecharger l obj en memoir
        IDao dao= (IDao) cDao.getConstructor().newInstance();
        //cest une instanciation dynamique =>new Daoimp()

       // MetierImpl metier=new MetierImpl();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);


        //metier.setDao(dao)
        Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao);
        System.out.println("res:"+metier.calcul());
    }
}
