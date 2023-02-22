import java.beans.Transient;
import java.lang.reflect.Method;
import java.util.*;

public class LinkedLists {
    static Scanner sc = new Scanner(System.in);
    static int value = 1, choice = 0;
    static LinkedList<String> animals1 = new LinkedList<>();
    static Stack<String> animals2 = new Stack<>();
    static Queue<String> animals3 = new ArrayDeque<>();
    static Set<String> animals4 = new HashSet<>();
    static Map<String, Integer> animals5 = new HashMap<String, Integer>();
    static Boolean choice1 = true, choice2 = true;

    public static void cases(int choose1, String type) {
        String name = "";
        choice2 = true;
        while (choice2) {
            switch (choose1) {
                case 6:
                case 1: {
                    System.out.print("\nEnter name of animal: ");
                    name = sc.next();
                    if (type == "LinkedList") {
                        animals1.add(name);
                    } else if (type == "Stack") {
                        animals2.push(name);
                    } else if (type == "Queue") {
                        animals3.add(name);
                    } else if (type == "Set") {
                        animals4.add(name);
                    } else if (type == "Map") {
                        animals5.put(name, value);
                        value += 1;
                    }
                    System.out.println(
                            "\nEnter Option: \n\t1 for add \n\t2 for delete \n\t3 for print\n\t4 for exit\n");
                    choose1 = sc.nextInt();
                    break;
                }
                case 2: {
                    if (type == "LinkedList") {
                        System.out.print("\nEnter name of animal: ");
                        name = sc.next();
                        animals1.remove(name);
                    } else if (type == "Stack") {
                        animals2.pop();
                    } else if (type == "Queue") {
                        animals3.remove();
                    } else if (type == "Set") {
                        animals4.clear();
                    } else if (type == "Map") {
                        animals5.clear();
                        value = 1;
                    }
                    System.out.println(
                            "\nEnter Option: \n\t1 for add \n\t2 for delete \n\t3 for print\n\t4 for exit\n");
                    choose1 = sc.nextInt();
                    break;
                }
                case 3: {
                    if (type == "LinkedList") {
                        System.out.println(animals1);
                    } else if (type == "Stack") {
                        System.out.println(animals2);
                    } else if (type == "Queue") {
                        System.out.println(animals3);
                    } else if (type == "Set") {
                        System.out.println(animals4);
                    } else if (type == "Map") {
                        System.out.println(animals5);
                    }
                    System.out.println(
                            "\nEnter Option: \n\t1 for add \n\t2 for delete \n\t3 for print\n\t4 for exit\n");
                    choose1 = sc.nextInt();
                    break;
                }
                case 4: {
                    choice2 = false;
                    choose1 = 1;
                    break;
                }
                default: {
                    System.out.println(
                            "\nEnter Option: \n\t1 for add \n\t2 for delete \n\t3 for print\n\t4 for exit\n");
                    choose1 = sc.nextInt();
                    break;
                }
            }
        }
    }

    public static void switches() {
        int c = 0;
        if (choice <= 5) {
            System.out.println(
                    "\nChoose Option: \n\t1 for add \n\t2 for delete \n\t3 for print\n\t4 for exit\n");
            c = sc.nextInt();
        }
        switch (choice) {
            case 1: {
                cases(c, "LinkedList");
                break;
            }
            case 2: {
                cases(c, "Stack");
                break;
            }
            case 3: {
                cases(c, "Queue");
                break;
            }
            case 4: {
                cases(c, "Set");
                break;
            }
            case 5: {
                cases(c, "Map");
                break;
            }
            case 6: {
                choice1 = false;
                break;
            }
        }
    }

    public static void main(String[] args) {
        while (choice1) {
            System.out.println(
                    "\nChoose Type: \n\t1 for Linkedlist \n\t2 for Stack\n\t3 for Queue\n\t4 forSet\n\t5 for Map\n\t6 for Exit\n");
            choice = sc.nextInt();
            switches();
        }
        final long start = System.currentTimeMillis();
        double time1 = (System.currentTimeMillis() - start);
        System.out.println(time1 + " ms");
    }
}
