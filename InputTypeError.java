public class InputTypeError extends RuntimeException{
    String msg;
    public InputTypeError(String msg) {
            this.msg = msg;
        }

        @Override
        public String toString() {
            return "Hiba! Az " + msg + "nem szám";
        }
    }
    

