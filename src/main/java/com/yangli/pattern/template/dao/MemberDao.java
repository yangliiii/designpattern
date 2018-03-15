package com.yangli.pattern.template.dao;

import com.yangli.pattern.template.JdbcTemplate;
import com.yangli.pattern.template.RowMapper;
import com.yangli.pattern.template.entity.Member;

import java.sql.ResultSet;
import java.util.List;

/**
 * Created by lies on 2018/3/15.
 */
public class MemberDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<?> query() throws Exception {
        String sql = "select * from member";
        return jdbcTemplate.executeQuery(sql, null, new RowMapper() {
            public Object mapRow(ResultSet rs, int rowNummber) throws Exception {
                Member member = new Member() ;
                member.setUsername(rs.getString("username"));
                return member;
            }
        });
    }
}
