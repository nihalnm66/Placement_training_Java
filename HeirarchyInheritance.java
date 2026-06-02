import java.util.Arrays;

class Store{
    String[] feedbacks={};
    public void viewAllFeedbacks(){
        System.out.println(Arrays.toString(feedbacks));
    }
}
class JavaBatch extends Store{
    String expertName="";
    public JavaBatch(int size){
        feedbacks=new String[size];
    }
    public void addFeedback(String comments){
        for(int i=0;i<feedbacks.length;i++)
            if(feedbacks[i]==null || feedbacks[i]==""){
                feedbacks[i]=comments;
                System.out.println("feedback noted");
                return;
            }
        System.out.println("Buffer is full can't add your feedback");
    }
}
class SoftskillBatch extends Store{
    public SoftskillBatch(){
        feedbacks = new String[]{"training is good","body language learned","need to slow the pace"};
    }
    public void read(int index){
        if(index<0 || index>=feedbacks.length)
            System.out.println("invalid feedback");
        else
            System.out.println(feedbacks[index]);
    }
}

public class HeirarchyInheritance{
    public static void main(String[] args) {
        Store str=new SoftskillBatch();
        str.viewAllFeedbacks();
        str.viewAllFeedbacks();
    //     JavaBatch java = new JavaBatch(2);
    //     java.expertName="abc";
    //     java.addFeedback("expected foundations not advance");
    //     java.addFeedback("need more time to write code");
    //     java.addFeedback("array is quite difficult");
    //     java.viewAllFeedbacks();
    //     SoftskillBatch soft = new SoftskillBatch();
    //     soft.read(9);
    //     soft.viewAllFeedbacks();
     }
}