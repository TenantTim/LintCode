public class Stack {

    private ArrayList<Integer> m_stack = null;

    /*
     * @param x: An integer
     * @return: nothing
     */
    public void push(int x) {
        if (m_stack == null) {
            m_stack = new ArrayList<Integer>();
        }

        m_stack.add(x);
    }

    /*
     * @return: nothing
     */
    public void pop() {
        if (m_stack.size() > 0) {
            m_stack.remove(m_stack.size() - 1);
        }
    }

    /*
     * @return: An integer
     */
    public int top() {
        return m_stack.get(m_stack.size() - 1);
    }

    /*
     * @return: True if the stack is empty
     */
    public boolean isEmpty() {
        return m_stack == null || m_stack.size() == 0;
    }
}