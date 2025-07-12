package DesignPatterns.StructuralDesignPattern.BridgeDesignPattern;

public class DriverClass {
    public static void main(String args[]){
        Channel email=new EmailAlert();
        Channel sms=new SMSAlert();
        Channel push=new PushAlert();

        Notification emailAlert=new Alert("EmailAlert",email);
        emailAlert.sendMsg();

        Notification smsAlert=new Alert("SMSAlert",sms);
        smsAlert.sendMsg();

        Notification pushAlert=new Alert("PushAlert",push);
        pushAlert.sendMsg();

        Notification emailReminder=new Reminder("EmailReminder", email);
        emailReminder.sendMsg();

        Notification smsReminder=new Reminder("SMSReminder",sms);
        smsReminder.sendMsg();

        Notification pushReminder=new Reminder("PushReminder",push);
        pushReminder.sendMsg();
    }
}
