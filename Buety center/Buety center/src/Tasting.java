import java.util.Scanner;

/**
 * Created by EBH on 07/04/21.
 */
public class Tasting {
        public static void main(String[] args) {
            Reservation r=new Reservation();

            Scanner enter= new Scanner(System.in);
            int chooice;
            boolean loop=true;

            while (loop == true)
            {

                System.out.println("\n********************************************** Welcome to Beaty Center ************************************************");
                System.out.println("  \n __________________________________________________________________________________________________________________________\n");
                System.out.println("\t1: Mukup \n\t2: Castmer \n \t0: Exit Of Programming ");
                System.out.println("  \n __________________________________________________________________________________________________________________________\n");

                System.out.print("Please enter your Choice : ");
                chooice= enter.nextInt();
                switch (chooice){
                    case 1:{
                        System.out.println("   __________________________________________________________________________________________________________________________\n");
                        System.out.println("\t1: Add mukup \n\t2: Delete mukup \n\t3: View mukup \n\t4: Eidt mukup \n\t0: Exit of the list");
                        System.out.println("what process you like do it: \n");

                        chooice = enter.nextInt();
                        while (chooice != 0) {
                            switch (chooice) {
                                case 1:
                                    r.add_Muk();break;
                                case 2:
                                    r.delete_mukup();break;
                                case 3:
                                    r.view_Mukup();break;
                                case 0:
                                    break;}}}
                    break;
                    case 2:{
                        System.out.println("  \n __________________________________________________________________________________________________________________________\n");
                        System.out.println("\t1: Add Castomer \n\t2: Delete Castomer \n\t3: View Castomer \n\t4: Eidt Castomer \n\t0: Exit of the list");
                        System.out.println("\twhat process you like do it: ");
                        chooice = enter.nextInt();
                        while (chooice != 0) {
                            switch (chooice) {
                                case 1:
                                {  r.add_Castmer();
                                    chooice = enter.nextInt();
                                }
                                    break;

                                case 2: {
                                    r.delet_Castomer();
                                    System.out.println("\t1: Add Castomer \n\t2: Delete Castomer \n\t3: View Castomer \n\t4: Eidt Castomer \n\t0: Exit of the list");
                                    System.out.println("\twhat process you like do it: ");
                                    chooice = enter.nextInt();

                                }
                                break;
                                case 3:
                                {  r.view_Castomer();
                                    System.out.println("\t1: Add Castomer \n\t2: Delete Castomer \n\t3: View Castomer \n\t4: Eidt Castomer \n\t0: Exit of the list");
                                    System.out.println("\twhat process you like do it: ");
                                    chooice = enter.nextInt();}
                                break;
                                case 4: {
                                    r.eidt_Castomer();
                                    System.out.println("\t1: Add Castomer \n\t2: Delete Castomer \n\t3: View Castomer \n\t4: Eidt Castomer \n\t0: Exit of the list");
                                    System.out.println("\twhat process you like do it: ");
                                    chooice = enter.nextInt();}
                                break;
                                case 0:
                                    break;

                            }}}
                    break;
                    case 0:
                        loop = false;
                        break;
                    default:
                        System.out.println("ENTER CORRECT CHOICE PLEASE");
                        break;
                }}}}


