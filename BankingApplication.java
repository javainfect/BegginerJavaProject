package BegginerJavaProject;


/**
 * Banking application
 * @author namanmishraaa
 * @version 1.0
 */
public class BankingApplication
{
    /**
     * Main menu is called from here
     * @param args Options selected by the user
     */
    public static void main(String[] args)
    {
        bankaccount obj = new bankaccount("Naman","BA0111" );
        obj.showMenu();
    }
}

