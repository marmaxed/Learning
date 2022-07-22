public class ChainOfResponsibility {
}
interface mailProvider{

}
abstract class SendingMailProcess{
    private SendingMailProcess Step = null;
    private int numberOfStep = -1;
    public SendingMailProcess(){
        this.Step=null;
        this.numberOfStep=-1;
    }
    public SendingMailProcess(SendingMailProcess someProcess){
        this.Step=someProcess;
        this.numberOfStep=-1;
    }
    public SendingMailProcess(SendingMailProcess someProcess, int number){
        this.Step=someProcess;
        this.numberOfStep=number;
    }
    public void doSmthWithMail(){
        if(Step!=null){
            Step.doSmthWithMail();
        }
    }
    public boolean isSend(){
        return numberOfStep ==-1;
    }
    public void setStep(SendingMailProcess someProcess, int number){
        this.Step = someProcess;
        this.numberOfStep=number;
    }
}

class writingProcessor extends SendingMailProcess{
    private int number =1;
    public writingProcessor(SendingMailProcess nextStep){
        super(nextStep,1);
    }
   public void doSmthWithMail(){
        if (!super.isSend()){
            System.out.println("I'm writing mail");
        }
        else {
            super.doSmthWithMail();
        }
   }
}

class packagingProcessor extends SendingMailProcess{
    private int number =1;
    public packagingProcessor(SendingMailProcess nextStep){
        super(nextStep,1);
    }
    public void doSmthWithMail(){
        if (!super.isSend()){
            System.out.println("I'm packaging mail");
        }
        else {
            super.doSmthWithMail();
        }
    }
}
class finalProcessor extends SendingMailProcess{
    private int number =3;
    public finalProcessor(){
        super(null,3);
    }
    public void doSmthWithMail(){
        if (!super.isSend()){
            System.out.println("I'm sending mail");
        }
        else {
            super.doSmthWithMail();
        }
    }
}