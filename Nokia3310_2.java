import java.util.Scanner;

public class Nokia3310_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n Main Menu");
            System.out.println("1. PhoneBook");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call divert");
            System.out.println("8. Games");
            System.out.println("9. Calculator");
            System.out.println("10. Reminders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. SIM Services");
            System.out.println("0. Exit");

            System.out.print("Enter a number: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    int phoneBookOption;
                    do {
                        System.out.println("\nPhone book: ");
                        System.out.println("1. Search");
                        System.out.println("2. Service No.s");
                        System.out.println("3. Add Name");
                        System.out.println("4. Erase");
                        System.out.println("5. Edit");
                        System.out.println("6. Assign tone");
                        System.out.println("7. Send b'card");
                        System.out.println("8. Options");
                        System.out.println("0. Back");

                        System.out.print("Select an option: ");
                        phoneBookOption = input.nextInt();

                        switch (phoneBookOption) {
                            case 8:
                                int options;
                                do {
                                    System.out.println("\nOptions: ");
                                    System.out.println("1. Type of view");
                                    System.out.println("2. Memory Status");
                                    System.out.println("0. Back");
                                    System.out.print("Select an option: ");
                                    options = input.nextInt();

                                    switch (options) {
                                        case 1:
                                            System.out.println("Type of view selected.");
                                            break;
                                        case 2:
                                            System.out.println("Memory Status selected.");
                                            break;
                                    }
                                } while (options != 0);
                                break;
                        }
                    } while (phoneBookOption != 0);
                    break;

                case 2:
                    int messageOption;
                    do {
                        System.out.println("\nMessages: ");
                        System.out.println("1. Write Messages");
                        System.out.println("2. Inbox");
                        System.out.println("3. Outbox");
                        System.out.println("4. Picture Messages");
                        System.out.println("5. Templates");
                        System.out.println("6. Smileys");
                        System.out.println("7. Message Settings");
                        System.out.println("8. Info Service");
                        System.out.println("9. Voice Mailbox Number");
                        System.out.println("10. Service Command Editor");
                        System.out.println("0. Back");

                        System.out.print("Select an option: ");
                        messageOption = input.nextInt();

                        if (messageOption == 7) {
                            int messageSettings;
                            do {
                                System.out.println("\nMessage Settings: ");
                                System.out.println("1. Message center Number");
                                System.out.println("2. Message sent as:");
                                System.out.println("3. Message Validity");
                                System.out.println("0. Back");
                                System.out.print("Select an option: ");
                                messageSettings = input.nextInt();
                            } while (messageSettings != 0);

                            int commonSettings;
                            do {
                                System.out.println("\nCommon: ");
                                System.out.println("1. Delivery Reports");
                                System.out.println("2. Reply via same centre");
                                System.out.println("3. Character Support");
                                System.out.println("0. Back");
                                System.out.print("Select an option: ");
                                commonSettings = input.nextInt();
                            } while (commonSettings != 0);
                        }

                    } while (messageOption != 0);
                    break;

                case 3:
                    System.out.println("Chat selected.");
                    break;

                case 4:
                    int callRegisterOption;
                    do {
                        System.out.println("\nCall Register: ");
                        System.out.println("1. Missed Calls");
                        System.out.println("2. Received Calls");
                        System.out.println("3. Dialled numbers");
                        System.out.println("4. Erase recent call lists");
                        System.out.println("5. Show call duration");
                        System.out.println("0. Back");

                        System.out.print("Select an option: ");
                        callRegisterOption = input.nextInt();

                        if (callRegisterOption == 5) {
                            int callDurationOption;
                            do {
                                System.out.println("\nCall Duration: ");
                                System.out.println("1. Last Call duration");
                                System.out.println("2. All call duration");
                                System.out.println("3. Received calls' duration");
                                System.out.println("4. Dialled calls duration");
                                System.out.println("5. Clear timers");
                                System.out.println("0. Back");
                                System.out.print("Select an option: ");
                                callDurationOption = input.nextInt();
                            } while (callDurationOption != 0);
                        }

                    } while (callRegisterOption != 0);
                    break;

                case 5:
                    int tonesOption;
                    do {
                        System.out.println("\nTones: ");
                        System.out.println("1. Ringing Tone");
                        System.out.println("2. Ringing Volume");
                        System.out.println("3. Incoming Call Alert");
                        System.out.println("4. Composer");
                        System.out.println("5. Message Alert tone");
                        System.out.println("6. Keypad Tones");
                        System.out.println("7. Warning and game tones");
                        System.out.println("8. Vibrating alert");
                        System.out.println("9. Screen saver");
                        System.out.println("0. Back");
                        System.out.print("Select an option: ");
                        tonesOption = input.nextInt();
                    } while (tonesOption != 0);
                    break;

                case 6:
                    int settingsOption;
                    do {
                        System.out.println("\nSettings: ");
                        System.out.println("1. Call settings");
                        System.out.println("2. Phone settings");
                        System.out.println("3. Security settings");
                        System.out.println("4. Restore Factory Settings");
                        System.out.println("0. Back");
                        System.out.print("Select an option: ");
                        settingsOption = input.nextInt();

                        switch (settingsOption) {
                            case 1:
                                System.out.println("1. Automatic redial");
                                System.out.println("2. Speed dialing");
                                System.out.println("3. Call waiting operations");
                                System.out.println("4. Own number sending");
                                System.out.println("5. Phone line in use");
                                System.out.println("6. Automatic answer");
                                break;

                            case 2:
                                System.out.println("\nPhone Settings:");
                                System.out.println("1. Language");
                                System.out.println("2. Cell Info Display");
                                System.out.println("3. Welcome Note");
                                System.out.println("4. Network selection");
                                System.out.println("5. Lights");
                                System.out.println("6. Confirm SIM service Actions");
                                break;

                            case 3:
                                System.out.println("\nSecurity Settings:");
                                System.out.println("1. PIN code request");
                                System.out.println("2. Call barring request");
                                System.out.println("3. Fixed dialling");
                                System.out.println("4. Closed user group");
                                System.out.println("5. Phone security");
                                System.out.println("6. Change Access codes");
                                break;
                        }

                    } while (settingsOption != 0);
                    break;

                case 7:
                    System.out.println("Call divert selected.");
                    break;

                case 8:
                    System.out.println("Games selected.");
                    break;

                case 9:
                    System.out.println("Calculator selected.");
                    break;

                case 10:
                    System.out.println("Reminders selected.");
                    break;

                case 11:
                    int clockOption;
                    do {
                        System.out.println("\nClock: ");
                        System.out.println("1. Alarm Clock");
                        System.out.println("2. Clock Settings");
                        System.out.println("3. Date Settings");
                        System.out.println("4. Stopwatch");
                        System.out.println("5. Countdown timer");
                        System.out.println("6. Auto update of date and time");
                        System.out.println("0. Back");
                        System.out.print("Select an option: ");
                        clockOption = input.nextInt();
                    } while (clockOption != 0);
                    break;

                case 12:
                    System.out.println("Profiles selected.");
                    break;

                case 13:
                    System.out.println("SIM Services selected.");
                    break;

                case 0:
                    System.out.println("Thank you for using Nokia 3310 Simulator!");
                    break;

                default:
                    System.out.println("Invalid selection, try again.");
                    break;
            }

        } while (menu != 0);
    }
}
