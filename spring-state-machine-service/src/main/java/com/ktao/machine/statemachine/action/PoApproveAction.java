package com.ktao.machine.statemachine.action;

import com.ktao.machine.entity.PurchaseOrder;
import com.ktao.machine.enums.PurchaseOrderEvent;
import com.ktao.machine.enums.PurchaseOrderState;
import lombok.extern.log4j.Log4j2;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

import static com.ktao.machine.consts.PurchaseOrderConst.PO_STATE_MACHINE_KEY;

/**
 * 采购单审核Action
 * @version 1.0
 * @author: kongtao
 * @description:
 * @date: 2020/1/13 1:12 下午
 */
@Component
@Log4j2
public class PoApproveAction implements Action<PurchaseOrderState, PurchaseOrderEvent> {
    @Override
    public void execute(StateContext<PurchaseOrderState, PurchaseOrderEvent> context) {
        PurchaseOrder order = (PurchaseOrder) context.getMessageHeader(PO_STATE_MACHINE_KEY);
        log.info("采购单: {} 发起审核." ,order.toString());
    }
}
