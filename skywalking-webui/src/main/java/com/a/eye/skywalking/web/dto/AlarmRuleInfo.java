package com.a.eye.skywalking.web.dto;

import com.a.eye.skywalking.web.entity.AlarmRule;

public class AlarmRuleInfo {
    private AlarmRule selfAlarmRule;
    private AlarmRule globalAlarmRule;
    private boolean hasGlobalAlarm;
    private boolean isGlobalAlarm;

    public AlarmRuleInfo(AlarmRule selfAlarmRule, AlarmRule globalAlarmRule) {
        this.selfAlarmRule = selfAlarmRule;
        this.globalAlarmRule = globalAlarmRule;

        if (selfAlarmRule == null) {
            isGlobalAlarm = true;
        }

        if (globalAlarmRule != null) {
            hasGlobalAlarm = true;
        }
    }
}
