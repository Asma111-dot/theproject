import java.util.Scanner;

    /**
     * Created by programmers on 08/12/2020.
     */
    public class Reservation {
        private int reservayionNo ;
        private String reservayionDate ;
        private CircularQueue<Processes> processe;
        private CircularQueue<Processes> queue = new CircularQueue<>();
        private CircularQueue<Mukup> mukupList=new CircularQueue<>();
        private CircularQueue<Hairstyle>hairList=new CircularQueue<>();
        private CircularQueue<Price>pricelist=new CircularQueue<>();
        private CircularQueue<Castomer> castomer1;


        Scanner enter = new Scanner(System.in);

        /**
         * the constructor empty of the Reservation class
         */
        public Reservation() {
            processe= new CircularQueue<>();
            castomer1=new CircularQueue<>();
        }

        /**
         * the constructor  of the Reservation class
         */

        public Reservation(int reservayionNo, String reservayionDate, CircularQueue<Processes> processe, Castomer c,
                           CircularQueue<Processes> queue, CircularQueue<Mukup> mukupList,
                           CircularQueue<Hairstyle> hairList, CircularQueue<Price> pricelist,
                           CircularQueue<Castomer> castomer1, Scanner enter) {
            this.reservayionNo = reservayionNo;
            this.reservayionDate = reservayionDate;
            this.processe = processe;
            this.queue = queue;
            this.mukupList = mukupList;
            this.hairList = hairList;
            this.pricelist = pricelist;
            this.castomer1 = castomer1;
            this.enter = enter;
        }

        /*
        *  Getter and Setter of the Reservation class
        */

        public int getReservayionNo() {
            return reservayionNo;
        }

        public void setReservayionNo(int reservayionNo) {
            this.reservayionNo = reservayionNo;
        }

        public String getReservayionDate() {
            return reservayionDate;
        }

        public void setReservayionDate(String reservayionDate) {
            this.reservayionDate = reservayionDate;
        }

        public CircularQueue<Processes> getProcesse() {
            return processe;
        }

        public void setProcesse(CircularQueue<Processes> processe) {
            this.processe = processe;
        }

        public CircularQueue<Processes> getQueue() {
            return queue;
        }

        public void setQueue(CircularQueue<Processes> queue) {
            this.queue = queue;
        }

        public Scanner getEnter() {
            return enter;
        }

        public void setEnter(Scanner enter) {
            this.enter = enter;
        }

        public CircularQueue<Mukup> getMukupList() {
            return mukupList;
        }

        public void setMukupList(CircularQueue<Mukup> mukupList) {
            this.mukupList = mukupList;
        }

        public CircularQueue<Hairstyle> getHairList() {
            return hairList;
        }

        public void setHairList(CircularQueue<Hairstyle> hairList) {
            this.hairList = hairList;
        }

        public CircularQueue<Price> getPricelist() {
            return pricelist;
        }

        public void setPricelist(CircularQueue<Price> pricelist) {
            this.pricelist = pricelist;
        }

        public Reservation(int processesNo, String expensivType, String midType, String cheapType, Price price) {
        }

        public CircularQueue<Castomer> getCastomer1() {
            return castomer1;
        }

        public void setCastomer1(CircularQueue<Castomer> castomer1) {
            this.castomer1 = castomer1;
        }

        /***************  Add Mukup   ******************/
        public void add_Muk (){
            // System.out.println(" 1- Mukup ");
            int chose = enter.nextInt();
            if (chose == 1) {
                Mukup newMuk=new Mukup();
                System.out.println("  Mukup Number : \n\t 1: Brial makeup مكياج عرائسي \n\t 2: Makeup of wives مكياج مزوجات \n\t 3: Youth makeup مكباج شبابي");
                int x= enter.nextInt();
                if(x==1){
                    System.out.println(" The cost of brial makeup is = 15000 R.Y");
                }
                else if (x==2){
                    System.out.println(" The cost of wives makeup is = 10000 R.Y");
                }
                else if (x==3){
                    System.out.println(" The cost youth makeup is = 7000 R.Y");
                }
                else {
                    System.out.println(" Error");
                }
            }}
        /**
         * method to delete mukup
         *
         * @return
         */
        public boolean delete_mukup() {
            System.out.println("Enter Mukup iD want to delete it ");
            int id= enter.nextInt();
            for (int i = 0; i < queue.size(); i++) {
                if (mukupList.first().getMakeupNo() == id) {
                    mukupList.dequeue();
                    return true;

                }
                mukupList.rotate();
            }
            return false;
        }
        /**
         * view all Mukup
         */
        public void view_Mukup() {
            for (int i = 0; i < mukupList.size(); i++) {
                System.out.println(pricelist.first().toString());
                pricelist.rotate();

            }
        }
        /**
         * method to edit Mukup
         *
         * @param proNo
         * @param nProNo
         * @return
         */
        public boolean edit_Mukup(int proNo, int nProNo) {
            System.out.println(mukupList.first().toString());
            System.out.println("Enter Mukup ID ");
            int id = enter.nextInt();
            for (int i = 0; i < mukupList.size(); i++) {
                if (mukupList.first().getMakeupNo() == id) {
                    System.out.println("Enter new name");
                    mukupList.first().setProcessesNo(nProNo);
                    return true;
                }
                mukupList.rotate();

            }
            return false;
        }
        // Add Castomer
        public void add_Castmer() {

                Castomer newcastmoer = new Castomer();
                System.out.println(" Castomer ID :  ");
                int id = enter.nextInt();
                newcastmoer.setCastomerNo(id);

                System.out.println(" Castomer name : ");
                String name = enter.next();
                newcastmoer.setCastomerFullname(name);

                System.out.println(" Castomer phone : ");
                int phone = enter.nextInt();
                newcastmoer.setCastomerPhone(phone);


                System.out.println("\t\t#######  Add Secscfull ########");
            castomer1.enqueue(newcastmoer);
            System.out.println("\t1: Add Castomer \n\t2: Delete Castomer \n\t3: View Castomer \n\t4: Eidt Castomer \n\t0: Exit of the list");
            }
            // Vew all Castomer
        public void view_Castomer() {
            for (int i = 0; i < castomer1.size(); i++) {
                System.out.println(castomer1.first().displayCastomer());
                castomer1.rotate();

            }
        }
        // Delete Castomer
        public boolean delet_Castomer() {
            System.out.println("Enter Castomer iD want to delete it ");
            int id= enter.nextInt();

            for (int i = 0; i < castomer1.size(); i++) {
                if (castomer1.first().getCastomerNo() == id) {
                    castomer1.dequeue();
                    System.out.println("\t\t#######  delete Secscfull ########");

                    return true;
                }
                castomer1.rotate();
            }
            return false;
        }
        //eidt  Castomer

        public boolean eidt_Castomer() {
            System.out.println(castomer1.first().displayCastomer());
            System.out.println("Enter Castomer ID ");
            int id = enter.nextInt();
            for (int i = 0; i < castomer1.size(); i++) {
                if (castomer1.first().getCastomerNo() == id) {
                    System.out.println(" Enter new neme ");
                    String frsitname=enter.next();
                    castomer1.first().setCastomerFullname(frsitname);
                    System.out.println(castomer1.first().displayCastomer());
                    System.out.println("\t\t ######### Eidt Secscfull ######## ");

                    return true;
                }
                castomer1.rotate();
            }
            System.out.println("\t Not found");
            return false;
        }
        /**
         * view all Hairstyls
         *
         * @param
         */
        public void view_Hair() {
            for (int i = 0; i < queue.size(); i++) {
                //if (queue.first() instanceof Hairstyle)
                System.out.println(queue.first());
                queue.rotate();
            }
        }
        /**
         * method to delete Hairstyls
         *
         * @return
         */
        public String delete_hair() {
            System.out.println("Enter Hairstyle iD want to delete it ");
            int id= enter.nextInt();
            String del = "";
            for (int i = 0; i < hairList.size(); i++) {
                if (hairList.first().getHairstyleNo() == id) {
                    hairList.dequeue();

                }
                hairList.rotate();

            }
            return "the processes not found";
        }

        /**
         * method to edit Hairstyls
         *
         * @param proNo
         * @param nProNo
         * @return
         */
        public boolean edit_hair(int proNo, int nProNo) {
            for (int i = 0; i < mukupList.size(); i++) {
                if (hairList.first().getHairstyleNo() == proNo) {
                    hairList.first().setProcessesNo(nProNo);
                    return true;
                }
                mukupList.rotate();

            }
            return false;
        }
    }