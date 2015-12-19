package com.liulishuo.filedownloader.event;


import com.liulishuo.filedownloader.model.FileDownloadTransferModel;

/**
 * Created by Jacksgong on 9/24/15.
 * <p/>
 * 内部 通信 事件
 */
public class FileDownloadTransferEvent extends IFileEvent {

    public final static String ID = "event.download.transfer";

    public FileDownloadTransferEvent(final FileDownloadTransferModel transfer) {
        super(ID);
        this.transfer = transfer;
    }

    private FileDownloadTransferModel transfer;

    public FileDownloadTransferModel getTransfer() {
        return transfer;
    }
}
