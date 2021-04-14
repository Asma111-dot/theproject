    /**
     * Created by programmers on 09/12/2020.
     */
    public class Mukup extends Processes {
        private int makeupNo ;
        private String descriptionM ;
        private String bridesSection ;
        private String youthSection ;
        private String wivesSection ;
        private double discount;

        /**
         * the constructor  empty of the Mukup class
         */
        public Mukup() {}

        /**
         * the constructor  of the Mukup class
         */

        public Mukup(int processesNo, String expensivType, String midType, String cheapType, Price price, int makeupNo, String descriptionM, String bridesSection, String youthSection, String wivesSection, double discount) {
            super(processesNo, expensivType, midType, cheapType, price);
            this.makeupNo = makeupNo;
            this.descriptionM = descriptionM;
            this.bridesSection = bridesSection;
            this.youthSection = youthSection;
            this.wivesSection = wivesSection;
            this.discount = discount;
        }
 /*
    Getter and Setter of the Mukup class
     */

        public int getMakeupNo() {
            return makeupNo;
        }

        public void setMakeupNo(int makeupNo) {
            this.makeupNo = makeupNo;
        }

        public String getDescriptionM() {
            return descriptionM;
        }

        public void setDescriptionM(String descriptionM) {
            this.descriptionM = descriptionM;
        }

        public String getBridesSection() {
            return bridesSection;
        }

        public void setBridesSection(String bridesSection) {
            this.bridesSection = bridesSection;
        }

        public String getYouthSection() {
            return youthSection;
        }

        public void setYouthSection(String youthSection) {
            this.youthSection = youthSection;
        }

        public String getWivesSection() {
            return wivesSection;
        }

        public void setWivesSection(String wivesSection) {
            this.wivesSection = wivesSection ;
        }

        public double getDiscount() {
            return discount;
        }

        public void setDiscount(double discount) {
            this.discount = discount;
        }

        /**
         *
         * @return the value of Mukup
         */

        @Override
        public String toString() {
            return "Mukup{" +
                    "makeupNo=" + makeupNo +
                    ", descriptionM='" + descriptionM + '\'' +
                    ", bridesSection='" + bridesSection + '\'' +
                    ", youthSection='" + youthSection + '\'' +
                    ", wivesSection='" + wivesSection + '\'' +
                    ", discount=" + discount +
                    '}';
        }

    }

