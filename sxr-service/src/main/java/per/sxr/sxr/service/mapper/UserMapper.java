package per.sxr.sxr.service.mapper;

import org.apache.ibatis.annotations.Mapper;
import per.sxr.sxr.service.domain.User;

import java.util.List;

@Mapper
public interface UserMapper {
    /**
     * 查询
     *
     * @param userId
     * @return
     */
    User selectById(Long userId);

    /**
     * 批量查询
     *
     * @param userIdList
     * @return
     */
    List<User> selectByIdList(List<Long> userIdList);

    /**
     * 插入
     *
     * @param user
     * @return
     */
    int insert(User user);

    /**
     * 批量插入
     *
     * @param userList
     * @return
     */
    int batchInsert(List<User> userList);

    /**
     * 条件更新
     *
     * @param user
     * @return
     */
    int updateByCondition(User user);

    /**
     * 更新
     *
     * @param user
     * @return
     */
    int updateById(User user);

    /**
     * 删除
     *
     * @param userId 用户id
     * @return 无
     */
    int deleteById(Long userId);
}