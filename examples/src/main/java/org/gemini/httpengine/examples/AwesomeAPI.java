package org.gemini.httpengine.examples;

import org.gemini.httpengine.annotation.Path;
import org.gemini.httpengine.annotation.TaskId;
import org.gemini.httpengine.library.OnResponseListener;

/**
 * Created by geminiwen on 15/5/21.
 */
public interface AwesomeAPI {
    interface TASKID {
        String TASK_GET_LOGIN = "login";
    }

    @Path("http://www.baidu.com")
    @TaskId(TASKID.TASK_GET_LOGIN)
    void doSomethingAwesome(OnResponseListener l,
                            String papatuo,
                            String nickname);
}
