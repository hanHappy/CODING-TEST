package inflearn.section_8;

import java.util.*;

public class 피자배달거리_DFS {

    static int answer = Integer.MAX_VALUE;

    static int solution(int n, int m, int[][] map){

        Map<String, Object> stores = findHousesAndPizzas(n, map);
        List<House> houses = (List<House>)stores.get("houses");
        List<Pizza> pizzas = (List<Pizza>)stores.get("pizzas");

        Pizza[] selectedPizzas = new Pizza[m];

        findSuitablePizzas(0, 0, m, houses, pizzas, selectedPizzas);

        return answer;
    }

    private static void findSuitablePizzas(int l, int s, int m, List<House> houses, List<Pizza> pizzas, Pizza[] selectedPizzas) {
        if(l == m){
            answer = Math.min(calculateDistance(houses, selectedPizzas), answer);
        } else {
            for(int i = s; i < pizzas.size(); i++){
                selectedPizzas[l] = pizzas.get(i);
                findSuitablePizzas(l+1, i+1, m, houses, pizzas, selectedPizzas);
            }
        }
    }

    private static int calculateDistance(List<House> houses, Pizza[] selectedPizzas) {

        int distance = 0;

        for(int i = 0; i < houses.size(); i++ ){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < selectedPizzas.length; j++){
                int dx = Math.abs(selectedPizzas[j].x - houses.get(i).x);
                int dy = Math.abs(selectedPizzas[j].y - houses.get(i).y);
                int tempDistance = dx + dy;
                min = Math.min(min, tempDistance);
            }
            distance += min;
        }

        return distance;
    }

    private static Map<String, Object> findHousesAndPizzas(int n, int[][] map) {
        
        List<House> houses = new ArrayList<>();
        List<Pizza> pizzas = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(map[i][j] == 1)
                    houses.add(new House(i, j));
                else if(map[i][j] == 2)
                    pizzas.add(new Pizza(i, j));
            }
        }
        Map<String, Object> stores = new HashMap<>();
        stores.put("houses", houses);
        stores.put("pizzas", pizzas);

        return stores;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                map[i][j] = sc.nextInt();
        }
        System.out.println(solution(n, m, map));
    }
}

class Pizza {
    int x, y;

    public Pizza(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pizza [x=" + x + ", y=" + y + "]";
    }
    

}

class House {
    int x, y;

    public House(int x, int y) {
        this.x = x;
        this.y = y;
    }

}