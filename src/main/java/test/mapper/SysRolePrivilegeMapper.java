package test.mapper;

import java.util.List;
import test.model.SysRolePrivilege;

public interface SysRolePrivilegeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbg.generated
     */
    int insert(SysRolePrivilege record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_privilege
     *
     * @mbg.generated
     */
    List<SysRolePrivilege> selectAll();
}