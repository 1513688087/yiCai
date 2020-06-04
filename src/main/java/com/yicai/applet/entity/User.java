package com.yicai.applet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer fID;
    private String fCode;
    private String fName;
    private String fPassword;
    private String fChangeNext;
    private String fPWDExpire;
    private String fLock;
    private String fChangeTime;
    private String fStatus;
    private String fFlag;
    private String fDept;
    private String fCardNO;
    private String fNotes;
    private String fLookSelf;
    private String fEditSelf;
    private String fLookSell;
    private String fLookPro;
}
