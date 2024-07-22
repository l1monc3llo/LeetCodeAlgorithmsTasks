class Person{
    String name;
    int height;
    Person(String name, int height){
        this.name = name;
        this.height = height;
    }
}

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        PriorityQueue<Person> pq = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p2.height, p1.height);
            }
        });
        for (int i = 0; i < names.length; ++i) {
            pq.add(new Person(names[i], heights[i]));
        }
        String[] sortedNames = new String[names.length];
        int index = 0;
        while (!pq.isEmpty()) {
            sortedNames[index++] = pq.poll().name;
        }
        return sortedNames;

    }
}
