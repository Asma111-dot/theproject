
    /**
     * Created by programmers on 08/12/2020.
     */
    public class Price {
        private double cost ;
        private double work ;

        /**
         * the constructor  of the Price class
         */
        public Price(double cost) {
            this.cost = cost;
            work=3000;
        }
     /*
    Getter and Setter of the Price class
     */

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public double getWork() {
            return work;
        }

        public void setWork(double work) {
            this.work = work;
        }

        /**
         *
         * @return the value of Price
         */
        @Override
        public String toString() {
            return "Price{" +
                    "cost=" + cost +
                    ", work=" + work +
                    '}';
        }
        /*
        Practical for calculating the price with work
         */
        public double calculateSum()
        {
            double sum ;
            sum=cost*work;
            return sum;
        }
    }


