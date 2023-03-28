public class App {
    public static void main(String[] args) throws Exception {
        
        String[] list1 = new String[]{"manga", "uva", "pera"};
        String[] list2 = new String[]{"manga", "maçã", "pera", "kiwi"};

        for(int i = 0; i<list1.length; i++) {
            for(int j = 0; j<list2.length; j++){
                if(list1[i] == list2[j]){
                    System.out.println("Fruta em comum: " + list1[i]);
                }
            }
        }

    }
}
