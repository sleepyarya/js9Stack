
public class StackSurat03 {
    private Surat03[] stack;
    private int top;
    private int size;

    public StackSurat03(int size) {
        this.size = size;
        stack = new Surat03[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat03 surat) {
        if (!isFull()) {
            stack[++top] = surat;
            System.out.println("Surat dari " + surat.namaMahasiswa + " berhasil diterima");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat03 pop() {
        if (!isEmpty()) {
            Surat03 processed = stack[top--];
            System.out.println("Surat dari " + processed.namaMahasiswa + " sedang diproses...");
            return processed;
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat03 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

    public boolean search(String nama) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}