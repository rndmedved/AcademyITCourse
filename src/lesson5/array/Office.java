package my.test.array;

public class Office {


    /**
     * Получение максимальной зарплаты из массива зарплат
     * @param payments - это массив зарплат первого офиса
     * @return максимальный оклад
     */
    static int getMaxSalary(int payments[]){
//        Пусть первый оклад является максимальным
        int maxSalary = payments[0];//первая зарплата
        for(int i = 1;i < payments.length;i++){//перебираем все з/п после первой, которую уже использовали
            if(maxSalary < payments[i]){//если предполагаемая з/п меньше текущей рассматриваемой, то переопределяем maxSalary
                maxSalary = payments[i];
            }
        }
        return maxSalary;//это гарантированно макс. оклад
    }

    static int[] setOffice(String title,int countMen,boolean isManagement){
        System.out.println(title);
        int mas[] = new int[countMen];//подготовили места для сотрудников
        for(int i = 0;i < countMen;i++){
            mas[i] = (int) (Math.random() * 120000 + 30000);
            if(isManagement){//если в этом офисе руководство, оклад увеличенный
                mas[i] *= 3;//если руководство, то умножаем втрое оклад
            }
            System.out.println("Сотрудник №" + (i + 1) + " зарабатывает " + mas[i]);
        }
        System.out.println("----------------------------------");
        System.out.println("Максимальный оклад в данном офисе: " + getMaxSalary(mas));
        System.out.println("----------------------------------");
        return mas;//присвоили методу массив з/п
    }

    public static void main(String[] args) {
        int office1[] = setOffice("Офис на Московской",15,false);
        int office2[] = setOffice("Офис на Чернышевского",10,false);
        int office3[] = setOffice("Офис на Пионерской",5,true);

        System.out.println("Самая большая з/п: " + Math.max(Math.max(getMaxSalary(office1),getMaxSalary(office2)),getMaxSalary(office3)));
    }
}

