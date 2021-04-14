
    /**
     * Created by  programmers on 08/12/2020.
     */
    public  class  Processes {
        private int processesNo;
        private String expensivType;
        private String midType;
        private String cheapType;
        private Price price;

        /**
         * the constructor  empty
         */

        public Processes() {}

        /**
         * the constructor  of the Processes class
         */
        public Processes(int processesNo, String expensivType, String midType, String cheapType, Price price) {
            this.processesNo = processesNo;
            this.expensivType = expensivType;
            this.midType = midType;
            this.cheapType = cheapType;
            this.price = price;
        }
    /*
    Getter and Setter of the Processes class
     */

        public int getProcessesNo() {
            return processesNo;
        }

        public void setProcessesNo(int processesNo) {
            this.processesNo = processesNo;
        }

        public String getExpensivType() {
            return expensivType;
        }

        public void setExpensivType(String expensivType) {
            this.expensivType = expensivType;
        }

        public String getMidType() {
            return midType;
        }

        public void setMidType(String midType) {
            this.midType = midType;
        }

        public String getCheapType() {
            return cheapType;
        }

        public void setCheapType(String cheapType) {
            this.cheapType = cheapType;
        }

        public Price getPrice() {
            return price;
        }

        public void setPrice(Price price) {
            this.price = price;
        }
        /**
         *
         * @return the value of Processes
         */

        @Override
        public String toString() {
            return "Processes{" +
                    "processesNo=" + processesNo +
                    ", expensivType='" + expensivType + '\'' +
                    ", midType='" + midType + '\'' +
                    ", cheapType='" + cheapType + '\'' +
                    ", price=" + price +
                    '}';
        }
    }


