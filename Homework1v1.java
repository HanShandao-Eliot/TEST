import java.util.Scanner;
public class Homework1v1 {
    public static void main(String []args){
        /*
        现有一个公司，其中包括众多员工，员工分为两类，一种为普通员工（工资按每个月算），一种为临时工（工资按每小时算）。
        属性：
            公司：名称companyName、地址companyAddress、普通员工normEmployee、临时工tempEmployee
            普通员工：名字name、部门department、薪资salary
            临时工（继承普通员工）属性：工作时长、每小时薪资
        方法：基本的getter、setter及构造对象
        公司：增加一个员工或临时工、打印所有员工信息、打印所有临时工信息
        临时工：计算临时工薪资（时长*每小时薪资）
        提示：了解java中对象的概念、了解继承、链表list
         */
        String result="";
        Scanner scanner = new Scanner(System.in);
            System.out.println("公司的名称为：");
            String companyName = scanner.nextLine();//公司名称companyName

            System.out.println("公司的地址为：");
            String companyAddress = scanner.nextLine();//公司地址companyAddress

        result += "公司名："+companyName+", 地址："+companyAddress+'\n'+"公司的工资结算："+'\n';

            System.out.println("公司普通人数为：");
            int normNum = scanner.nextInt();//normNum普通员工人数

                 for(int i=1;i<=normNum;i++){

                    System.out.println("请输入员工的姓名");
                    String name = scanner.next();//name员工的姓名
                    result += "employeeName:"+name;

                    System.out.println("请输入员工的部门");
                    String department = scanner.next();//department员工的部门
                    result += " ,department:"+department;

                    System.out.println("请输入员工的薪资");
                    int salary = scanner.nextInt();//salary员工的薪资
                    result += " ,salary:"+salary+'\n'; 
                    }

        result +='\n';

        System.out.println('\n'+"公司临时工人数为：");
        int tempNum = scanner.nextInt();//tempNum临时工人数

                 for(int i=1;i<=tempNum;i++){

                    System.out.println("请输入员工的姓名");
                    String name = scanner.next();
                    result += "employeeName:"+name;

                    System.out.println("请输入员工的部门");
                    String department = scanner.next();
                    result += " ,department:"+department;

                    System.out.println("请输入员工的工作时长");
                    int workHours = scanner.nextInt(); //workHours员工的工作时长

                    System.out.println("请输入员工的按时薪资");
                    int salaryPerHour = scanner.nextInt();//salaryPerHour员工的按时薪资

                    result += " ,salary:"+(workHours*salaryPerHour)+'\n'; 
                 }

        scanner.close();
        System.out.println(result);

    }
}
