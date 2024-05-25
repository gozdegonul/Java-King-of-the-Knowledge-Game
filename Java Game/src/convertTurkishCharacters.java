public class convertTurkishCharacters {
    public static String convert(String str) {
        str = str.replace('Ç', 'C');
        str = str.replace('Ğ', 'G');
        str = str.replace('İ', 'I');
        str = str.replace('Ö', 'O');
        str = str.replace('Ş', 'S');
        str = str.replace('Ü', 'U');
        str = str.replace('ç', 'c');
        str = str.replace('ğ', 'g');
        str = str.replace('ı', 'i');
        str = str.replace('ö', 'o');
        str = str.replace('ş', 's');
        str = str.replace('ü', 'u');
        return str;

    }

}

