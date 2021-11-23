package kr.co.zesinc.board.model.vo;

public class Board {
    
    // 게시판 번호
    private int sn;
    // 게시판 유형 코드
    private int bdtpCode;
    // 제목
    private String title;
    // 내용
    private String contents;
    // 조회수
    private int rdcnt;
    // 등록자
    private String rgstId;
    // 등록일시
    private String rgstDt;
    // 수정자
    private String updtId;
    // 수정일시
    private String updtDt;
    // 사용여부
    private String useAt;
    // 게시시작일
    private String beginDt;
    // 게시종료일
    private String endDt;
    
    public Board() {
        
    }
    
    public Board(int sn, int bdtpCode, String title, String contents, int rdcnt, String rgstId, String rgstDt,
            String updtId, String updtDt, String useAt, String beginDt, String endDt) {
        super();
        this.sn = sn;
        this.bdtpCode = bdtpCode;
        this.title = title;
        this.contents = contents;
        this.rdcnt = rdcnt;
        this.rgstId = rgstId;
        this.rgstDt = rgstDt;
        this.updtId = updtId;
        this.updtDt = updtDt;
        this.useAt = useAt;
        this.beginDt = beginDt;
        this.endDt = endDt;
    }
    
    public int getSn() {
        return sn;
    }
    public void setSn(int sn) {
        this.sn = sn;
    }
    public int getBdtpCode() {
        return bdtpCode;
    }
    public void setBdtpCode(int bdtpCode) {
        this.bdtpCode = bdtpCode;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContents() {
        return contents;
    }
    public void setContents(String contents) {
        this.contents = contents;
    }
    public int getRdcnt() {
        return rdcnt;
    }
    public void setRdcnt(int rdcnt) {
        this.rdcnt = rdcnt;
    }
    public String getRgstId() {
        return rgstId;
    }
    public void setRgstId(String rgstId) {
        this.rgstId = rgstId;
    }
    public String getRgstDt() {
        return rgstDt;
    }
    public void setRgstDt(String rgstDt) {
        this.rgstDt = rgstDt;
    }
    public String getUpdtId() {
        return updtId;
    }
    public void setUpdtId(String updtId) {
        this.updtId = updtId;
    }
    public String getUpdtDt() {
        return updtDt;
    }
    public void setUpdtDt(String updtDt) {
        this.updtDt = updtDt;
    }
    public String getUseAt() {
        return useAt;
    }
    public void setUseAt(String useAt) {
        this.useAt = useAt;
    }
    public String getBeginDt() {
        return beginDt;
    }
    public void setBeginDt(String beginDt) {
        this.beginDt = beginDt;
    }
    public String getEndDt() {
        return endDt;
    }
    public void setEndDt(String endDt) {
        this.endDt = endDt;
    }

    @Override
    public String toString() {
        return "Board [sn=" + sn + ", bdtpCode=" + bdtpCode + ", title=" + title + ", contents=" + contents + ", rdcnt="
                + rdcnt + ", rgstId=" + rgstId + ", rgstDt=" + rgstDt + ", updtId=" + updtId + ", updtDt=" + updtDt
                + ", useAt=" + useAt + ", beginDt=" + beginDt + ", endDt=" + endDt + "]";
    }
    
    
}
// 게시글 번호  |  제목    |  작성자   |   작성일    |  