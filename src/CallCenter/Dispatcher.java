package CallCenter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zxm on 9/19/15.
 */
public class Dispatcher {
    private List<Queue<Call>> callQueues = new ArrayList<>();
    private List<Queue<Employee>> availableEmployeeQueues = new ArrayList<>();

    public Dispatcher(List<List<Employee>> employeeLists) {
        for (List<Employee> employeeList : employeeLists) {
            for (Employee employee : employeeList) {
                availableEmployeeQueues.get(employee.getRankNumber()).offer(employee);
            }
        }
    }

    public boolean receiveCall(Call call) {
        return callQueues.get(call.getRankNumber()).offer(call);
    }

    public void processCall() {
        while (true) {
            for (Queue<Call> callQueue : callQueues) {
                if (! callQueue.isEmpty()) {
                    Call call = callQueue.peek();
                    Queue<Employee> employeeQueue = availableEmployeeQueues.get(call.getRankNumber());
                    if (! employeeQueue.isEmpty()) {
                        dispatchCall(callQueue.poll(), employeeQueue.poll());
                    }
                }
            }
        }

    }

    public void dispatchCall(Call call, Employee employee) {
        call.setEmployee(employee);
        employee.setIsAvailable(false);
        employee.handleCall(call);

    }

}
