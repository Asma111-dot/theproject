/**
 * Created by programmers on 09/12/2020.
 */
    public class Hairstyle extends Processes {
        private int hairstyleNo ;
        private String descriptionH ;
        private String brideSection ;
        private double discount;


        /**
         * the constructor empty of the Hairstyle class
         */
        public Hairstyle() {}

        /**
         * the constructor  of the Hairstyle class
         */
        public Hairstyle(int processesNo, String expensivType, String midType, String cheapType, Price p,
                         Price price, double calPrice, int hairstyleNo, String descriptionH,
                         String brideSection, double discount) {
            super(processesNo, expensivType, midType, cheapType, price);
            this.hairstyleNo = hairstyleNo;
            this.descriptionH = descriptionH;
            this.brideSection = brideSection;
            this.discount = discount;
        }
      /*
    Getter and Setter of the Hairstyle class
     */

        public int getHairstyleNo() {
            return hairstyleNo;
        }

        public void setHairstyleNo(int hairstyleNo) {
            this.hairstyleNo = hairstyleNo;
        }

        public String getDescriptionH() {
            return descriptionH;
        }

        public void setDescriptionH(String descriptionH) {
            this.descriptionH = descriptionH;
        }

        public String getBrideSection() {
            return brideSection;
        }

        public void setBrideSection(String brideSection) {
            this.brideSection = brideSection;
        }

        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }
        /**
         *
         * @return the value of Hairstyle
         */
        @Override
        public String toString() {
            return "Hairstyle{" +
                    "hairstyleNo=" + hairstyleNo +
                    ", descriptionH='" + descriptionH + '\'' +
                    ", brideSection='" + brideSection + '\'' +
                    ", discount=" + discount +
                    '}';
        }
    }
