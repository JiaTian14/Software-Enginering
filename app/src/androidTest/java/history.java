public class history {
        private String date;
        private String time;
        private String location;


        public void Appointment(String date, String time, String location) {
            this.date = date;
            this.time = time;
            this.location = location;

        }

        public String getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }
        public String getLocation(){
            return location;
        }
    }

