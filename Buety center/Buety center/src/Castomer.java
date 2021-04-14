/**
     * Created by programmers on 08/12/2020.
     */
    public class Castomer {
        private int castomerNo ;
        private String castomerFullname ;
        private int  castomerPhone ;
        private Mukup mukup1;

    /**
     * the constructor empty of the Mukup class
     */
        public Castomer() {}

    public Castomer(int castomerNo, String castomerFullname, int castomerPhone, Mukup mukup1) {
        this.castomerNo = castomerNo;
        this.castomerFullname = castomerFullname;
        this.castomerPhone = castomerPhone;
        this.mukup1 = mukup1;
    }

    /**
     * the constructor of the Mukup class
     */

        /*
          * Getter and Setter of the Castomer class
       */
        public int getCastomerNo() {
            return castomerNo;
        }

        public void setCastomerNo(int castomerNo) {
            this.castomerNo = castomerNo;
        }

        public String getCastomerFullname() {
            return castomerFullname;
        }

        public void setCastomerFullname(String castomerFullname) {
            this.castomerFullname = castomerFullname;
        }

    public int getCastomerPhone() {return castomerPhone;}

    public void setCastomerPhone(int castomerPhone) {this.castomerPhone = castomerPhone;}

    public Mukup getMukup1() {return mukup1;}

    public void setMukup1(Mukup mukup1) {this.mukup1 = mukup1;}
    /*
     * @return the value of Castomer
     */

        public String displayCastomer() {
            return "Castomer{" +
                    "castomerNo=" + castomerNo +
                    ", castomerFullname='" + castomerFullname + '\'' +
                    ", castomerPhone=" + castomerPhone +
                    '}';
        }
    }


