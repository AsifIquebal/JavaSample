import java.util.ArrayList;
import java.util.List;

enum Separator {
    FORWARD_SLASH{
        public String toString() {
            return "\\/";
        }
    },
    PERIOD{
        public String toString() {
            return "\\.";
        }
    }
}

class Main {
    public static void main(String[] args) {
        // Simple splitter with one parameter
        // This should result in {“tmp”, “file.txt”)
        StringSplitter s1 = new StringSplitter(Separator.FORWARD_SLASH.toString());
        //List<String> split1 = s1.split("/tmp/file.txt");
        List<String> split1 = s1.split("/tmp/file.txt");
        System.out.println(split1.toString());
        // Complex splitter with two parameters
        // This should result in {“tmp”, “file”, “txt”)
        StringSplitter s2 = new StringSplitter(Separator.FORWARD_SLASH.toString(), Separator.PERIOD.toString());
        List<String> split2 = s2.split("/tmp/file.txt");
        System.out.println(split2.toString());
    }
}

class StringSplitter {

    List<String> splitter = new ArrayList<>();
    public StringSplitter(String splitter1){
        splitter.add(splitter1);
    }

    StringSplitter(String splitter1, String splitter2){
        splitter.add(splitter1);
        splitter.add(splitter2);
    }

    public List<String> split(String string) {
        String delimiter  = String.join("|", splitter);
        String[] strings = string.split(delimiter);
        List<String> splittedList= new ArrayList<>();
        for(String str:strings){
            if(null!=str && !str.isEmpty()){
                splittedList.add(str);
            }
        }
        return splittedList;
    }
}

















