package com.yangli.pattern.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lies on 2018/3/15.
 */
public class JdbcTemplate {


    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    //创建链接
    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    //创建语句集
    private PreparedStatement getPrepareStatement(Connection connection,String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

    // 获取结果集
    public ResultSet executeQuery(PreparedStatement ps, Object [] obj) throws SQLException {
        for (int i = 0; i < obj.length ; i++) {
            ps.setObject(i,obj[i]);
        }
        return ps.executeQuery();
    }

    // 解析语句集
    private List<?> parseResultSet (ResultSet rs, RowMapper rowMapper) throws Exception {
        List<Object> result = new ArrayList<Object>();
        int rowNumber = 1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNumber ++));
        }
        return result;
    }

    private void closeResultSet(ResultSet rs) throws SQLException {
        rs.close();
    }

    private void closeStatement(PreparedStatement ps) throws SQLException {
        ps.close();
    }

    private void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }

    public List<?> executeQuery(String sql,Object[] obj,RowMapper rowMapper) throws Exception {

        // 1.创建链接
        Connection connection = this.getConnection();
        // 2.创建语句集
        PreparedStatement ps = this.getPrepareStatement(connection,sql);
        // 3.执行语句集，获取结果集
        ResultSet rs = this.executeQuery(ps,obj);
        // 4.解析语句集
        List<?> result = this.parseResultSet(rs,rowMapper);
        // 5.关闭结果集
        this.closeResultSet(rs);
        // 6.关闭语句集
        this.closeStatement(ps);
        // 7.关闭连接
        this.closeConnection(connection);
        return result;
    }
}
