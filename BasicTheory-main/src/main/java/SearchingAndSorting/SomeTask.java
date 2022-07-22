package SearchingAndSorting;

import java.util.*;

/*
* Клуб Юных Хакеров организовал на своем сайте форум. Форум имеет следующую структуру:
*  каждое сообщение либо начинает новую тему,
*  либо является ответом на какое-либо предыдущее сообщение и принадлежит той же теме.
После нескольких месяцев использования своего форума юных хакеров заинтересовал вопрос
*  - какая тема на их форуме наиболее популярна. Помогите им выяснить это.*/

/*
* Всем известно, что со временем клавиатура изнашивается,
*  и клавиши на ней начинают залипать. Конечно, некоторое время такую клавиатуру
*  еще можно использовать, но для нажатий клавиш приходиться использовать большую силу.
При изготовлении клавиатуры изначально для каждой клавиши задается количество нажатий,
*  которое она должна выдерживать. Если знать эти величины для используемой клавиатуры,
*  то для определенной последовательности нажатых клавиш можно определить,
*  какие клавиши в процессе их использования сломаются, а какие – нет.
Требуется написать программу, определяющую, какие клавиши сломаются
* в процессе заданного варианта эксплуатации клавиатуры.*/


public class SomeTask {
    Scanner scan = new Scanner(System.in);

    public void Forum() {
        int numValue;
        int count = scan.nextInt();
        int themeNum = 0;
        String textValue;
        String someMes;
        HashMap<Integer, String> messages = new HashMap<>();
        HashMap<String, Integer> topic = new HashMap<>();
        for (int i = 0; i < count; i++) {
            numValue = scan.nextInt();
            textValue = scan.next();
            if (scan.hasNext()) {
                someMes = scan.next();
            }
            if (numValue == 0) {
                themeNum++;
                String theme = textValue;
                topic.put(theme, 1);
                messages.put(themeNum, theme);
            } else {
                int a = topic.get(messages.get(numValue));
                a++;
                topic.put(messages.get(numValue), a);
                messages.put(i + 1, messages.get(numValue));
            }
        }
        Collection<Integer> arr = topic.values();
        Integer maxValue = Collections.max(arr);
        Iterator it = topic.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (pair.getValue() == maxValue) {
                System.out.println("Популярнейшая тема: " + pair.getKey() + " Количество сообщений: " + pair.getValue());
            }
            it.remove();
        }
    }

    public void KeyBord() {
        int n = scan.nextInt();
        int[] endurance = new int[n];
        for (int i = 0; i < n; i++) {
            endurance[i] = scan.nextInt();
        }
        int[] click = new int[n];
        int pressamount = scan.nextInt();
        int[] press = new int[pressamount];
        for (int i = 0; i < n; i++) {
            press[i] = scan.nextInt();
        }
        for (int i = 0; i < 16; i++) {
            click[press[i] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (click[i] > endurance[i]) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }

    public void anotherPalindrome() {
        //TODO this
        int N = scan.nextInt();
        String Palindrome = scan.next();
        System.out.println(Palindrome);
        char[] futurePal = Palindrome.toCharArray();
        int size =0;
        //System.out.println(futurePal[0]==futurePal[2]);
        //находим повторы>2, на основании количества этих повтором считаем размер итогового массива
        //проходимся по массиву снова квадратом. если есть повтор увеличиваем индекс, повтор
        //добавляем в новый массив с конца и с начала. повтор делаем нулем
        //можно сначала сортировать для уменьшения алфавита
        for (int j = N-1; j >-1; j--) {
            for (int i = 0; i < j; i++) {
                if (futurePal[i] > futurePal[i + 1]) {
                    char temp = futurePal[i];
                    futurePal[i] = futurePal[i + 1];
                    futurePal[i + 1] = temp;
                }
            }
        }
        System.out.println(futurePal);
        int count = 1;
        int m =0;
        for (int i =1; i<N;i++){
            if(futurePal[i]==futurePal[i-1]){
                count++;
                if(i==N-1){
                    System.out.println("!");
                    System.out.println(i);
                    System.out.println(count);
                    size+=(count/2)*2;
                }
            }
            if(futurePal[i]!=futurePal[i-1]){
                System.out.println("!");
                System.out.println(i);
                System.out.println(count);
                size+=(count/2)*2;
                count=1;
            }
        }
        System.out.println(size);
        char[] palindrome = new char[size];
        int a = 0;
        int b = size-1;
        for(int i = 0; i<N-1; i++){
            for(int j = i+1; j<N; j++){
                if(futurePal[i]==' '||futurePal[j]==' '){
                    continue;
                }
                if (futurePal[i]==futurePal[j]){
                    palindrome[a]=futurePal[i];
                    palindrome[b]=futurePal[i];
                    a++;
                    b--;
                    futurePal[j]=' ';
                }
            }
        }
        System.out.println(palindrome);
        /*int a =0;
        int b = N-1;
        for (int j = N-1; j >-1; j--) {
            for (int i = 0; i < j; i++) {
                if (futurePal[i] > futurePal[i + 1]) {
                    char temp = futurePal[i];
                    futurePal[i] = futurePal[i + 1];
                    futurePal[i + 1] = temp;
                }
            }
        }
        System.out.println(futurePal);
        for (int i =N-1,j=1; i>N/2;i=-2,j+=2){
            char temp = futurePal[i];
            futurePal[i]=futurePal[j];
            futurePal[j]=temp;
        }
        System.out.println(futurePal);*/
        //находим повторы>2, на основании количества этих повтором считаем размер итогового массива
        //проходимся по массиву снова квадратом. если есть повтор увеличиваем индекс, повтор
        //добавляем в новый массив с конца и с начала. повтор делаем нулем
        //можно сначала сортировать для уменьшения алфавита
        int leftIndex = 0;
        int rightIndex = N - 1;
        /*while (leftIndex < rightIndex) {
            if (futurePal[leftIndex] == futurePal[rightIndex]) {
                palindrome[leftIndex] = futurePal[leftIndex];
                palindrome[rightIndex] = futurePal[rightIndex];
                leftIndex++;
                rightIndex--;
            } else {
                int index1 = 0;
                char preMin = futurePal[leftIndex + 1];
                char min = futurePal[leftIndex + 1];
                for (int i = leftIndex + 1; i <= rightIndex; i++) {
                    if (futurePal[i] < min) {
                        min = futurePal[i];
                        index1 = i;
                    }

                }
                //or temp or another arr
                char temp = futurePal[leftIndex];
                futurePal[leftIndex] = futurePal[index1];
                futurePal[index1] = temp;
                leftIndex++;
                int index2 = 0;
                char preMin2 = futurePal[leftIndex];
                char min2 = futurePal[leftIndex];
                for (int i = leftIndex; i < rightIndex; i++) {
                    if (futurePal[i] < preMin2) {
                        preMin2 = futurePal[i];
                        index2 = i;
                    }
                }
                char temp2 = futurePal[rightIndex];
                futurePal[rightIndex] = futurePal[index2];
                futurePal[index2] = temp2;
                rightIndex--;
            }
            System.out.println(futurePal);
        }*/
    }
}