package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiuzhenjiluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiuzhenjiluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiuzhenjiluView;


/**
 * 就诊记录
 *
 * @author 
 * @email 
 * @date 2022-01-28 11:04:28
 */
public interface JiuzhenjiluService extends IService<JiuzhenjiluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiuzhenjiluVO> selectListVO(Wrapper<JiuzhenjiluEntity> wrapper);
   	
   	JiuzhenjiluVO selectVO(@Param("ew") Wrapper<JiuzhenjiluEntity> wrapper);
   	
   	List<JiuzhenjiluView> selectListView(Wrapper<JiuzhenjiluEntity> wrapper);
   	
   	JiuzhenjiluView selectView(@Param("ew") Wrapper<JiuzhenjiluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiuzhenjiluEntity> wrapper);
   	

}

