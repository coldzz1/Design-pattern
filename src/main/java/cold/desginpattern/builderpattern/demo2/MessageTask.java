package cold.desginpattern.builderpattern.demo2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: 建造者设计模式 Domain类
 * <p>
 * Created by ys on 2020/7/16 10:30
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageTask {

    /**任务id**/
    private String taskId;

    /**内容**/
    private String content;

    /**信息id**/
    private String messageId;

    /**任务名称**/
    private String taskName;



}
