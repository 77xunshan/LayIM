package com.silence.domain

import com.silence.common.SystemConstant

/**
 * @description 返回值信息
 * @param code 状态，0表示成功，其他表示失败
 * @param msg 额外信息
 */
class ResultSet[T](var code: Int, var msg: String) {
        
    private var data: T = _  
  
    def this(data: T) = {
        this(SystemConstant.SUCCESS, SystemConstant.SUCCESS_MESSAGE)
        this.data = data      
    }

}
