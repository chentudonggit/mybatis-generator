package com.mybatis.generator.utils;

import com.mybatis.generator.domian.column.Column;
import com.mybatis.generator.domian.table.Table;

import javax.naming.ConfigurationException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipOutputStream;

/**
 * GenUtils
 *
 * @author chentudong
 * @date 2020/5/9 11:30 上午
 * @since 1.0
 */
public class GenUtils
{
    private GenUtils()
    {
        throw new IllegalStateException("Utility class");
    }

    private final static String FILE_NAME_MODEL = "Model.java.vm";
    private final static String FILE_NAME_MAPPER = "Mapper.java.vm";
    private final static String FILE_NAME_MAPPER_XML = "Mapper.xml.vm";
    private final static String FILE_NAME_SERVICE = "Service.java.vm";
    private final static String FILE_NAME_SERVICE_IMPL = "ServiceImpl.java.vm";
    private final static String FILE_NAME_CONTROLLER = "Controller.java.vm";
    private final static String FILE_NAME_PAGE = "index.html.vm";
    private final static String TEMPLATE_PATH = "template/";
    private final static String PACKAGE = "package";
    private final static String MODULE_NAME = "moduleName";

    public static List<String> getTemplates()
    {
        List<String> templates = new ArrayList<>();
        templates.add(TEMPLATE_PATH + FILE_NAME_MODEL);
        templates.add(TEMPLATE_PATH + FILE_NAME_MAPPER);
        templates.add(TEMPLATE_PATH + FILE_NAME_MAPPER_XML);
        templates.add(TEMPLATE_PATH + FILE_NAME_SERVICE);
        templates.add(TEMPLATE_PATH + FILE_NAME_SERVICE_IMPL);
        templates.add(TEMPLATE_PATH + FILE_NAME_CONTROLLER);
        templates.add(TEMPLATE_PATH + FILE_NAME_PAGE);
        return templates;
    }

    /**
     * 生成代码
     */
    public static void generatorCode(Table table, List<Column> columns, ZipOutputStream zip)
    {

    }

    /**
     * 获取配置信息
     */
    public static Configuration getConfig()
    {
        try
        {
            return new PropertiesConfiguration("generator.properties");
        } catch (ConfigurationException e)
        {
            throw new RuntimeException("获取配置文件失败，", e);
        }
    }
}
