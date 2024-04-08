class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> sandwich = new Stack<>();
        Queue<Integer> student = new LinkedList<Integer>();
        int n = students.length, k = 0;
        for (int i = n - 1; i >= 0; i--) {
            sandwich.push(sandwiches[i]);
            student.add(students[k++]);
        }

        while(!student.isEmpty()) {
            if (student.peek() == sandwich.peek()) {
                student.poll();
                sandwich.pop();
            }
            else if (student.contains(sandwich.peek())) {
                while (student.peek() != sandwich.peek()) {
                    student.add(student.poll());
                }
            } else {
                return student.size();
            }
        }
        return 0;
        
    }
}
