public class MovimientoDeDinero {

        private long id;
        private String concept;
        private float amount;
        private Empleado user;
        private Empresa enterprise;
        private date createdAt;
        private date updateAt;

//CONDTRUCTOR

        public MovimientoDinero(long id, String concept, float amount, Empleado user, Empresa enterprise, date createdAt, date updateAt) {
            this.id = id;
            this.concept = concept;
            this.amount = amount;
            this.user = user;
            this.enterprise = enterprise;
            this.createdAt = createdAt;
            this.updateAt = updateAt;
        }

        //SET AND GET

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getConcept() {
            return concept;
        }

        public void setConcept(String concept) {
            this.concept = concept;
        }

        public float getAmount() {
            return amount;
        }

        public void setAmount(float amount) {
            this.amount = amount;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public Enterprise getEnterprise() {
            return enterprise;
        }

        public void setEnterprise(Enterprise enterprise) {
            this.enterprise = enterprise;
        }

        public date getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(date createdAt) {
            this.createdAt = createdAt;
        }

        public date getUpdateAt() {
            return updateAt;
        }

        public void setUpdateAt(date updateAt) {
            this.updateAt = updateAt;
        }

}
