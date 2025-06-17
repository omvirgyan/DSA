class circularQArray {

    public static class cirQ {
        int f = -1; // front pointer
        int r = -1; // rear pointer
        int size = 0; // current size of the queue
        int[] arr = new int[10]; // array to store the queue elements

        public void add(int num) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is Full");
            } else if (size == 0) {
                f = r = 0;
                arr[0] = num;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[r] = num;
            } else {
                r++;
                arr[r] = num;
            }
            size++;
        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty");
            }
            size--;
            int x = arr[f];
            if (f == arr.length - 1) {
                f = 0;
            } else {
                f++;
            }
            return x;
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty");
            }
            return arr[f];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (size == 0) {
                System.out.print("Empty");
                return;
            }
            if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        cirQ cqa = new cirQ();
        cqa.add(90);
        cqa.add(91);
        cqa.add(92);
        cqa.add(93);
        cqa.add(94);
        cqa.display();
        cqa.add(95);
        cqa.add(96);
        cqa.add(97);
        cqa.add(98);
        cqa.add(99);
        System.out.println(cqa.remove());
        cqa.add(88);
        cqa.display();
        cqa.remove();
        cqa.add(1);

        cqa.display();
        System.out.println(cqa.size);
    }
}
