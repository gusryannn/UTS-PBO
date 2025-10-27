
    package Soal4;

    public class Lecturer extends Person {
        private String nip;

        public Lecturer(String name, String nip) {
            super(name);
            this.nip = nip;
        }

        @Override
        public void introduce() {
            System.out.println("Halo, saya dosen bernama " + getName() + " dengan NIP " + nip);
        }
    }


