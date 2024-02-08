public class FirstUniqueCharacter {
    public static void main(String[] args) {
        System.out.println(findUniqueCharacter("aabb"));

    }

    public static int findUniqueCharacter(String input) {
        int count = 0;
        for (int index = 0; index < input.length(); index++) {
            String oneValue = String.valueOf(input.charAt(index));
            for (int indice = 0; indice < input.length(); indice++) {
                if (String.valueOf(input.charAt(indice)).equals(oneValue)) {
                    count++;
                }
            }
            if(count == 1){
                return index;
            }
            count = 0;
        }
        return -1;
    }
}
