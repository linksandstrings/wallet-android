package com.mycelium.wapi.wallet.btc.bip44

import com.mrd.bitlib.crypto.HdKeyNode
import com.mycelium.wapi.wallet.manager.Config


data class HDConfig(val hdKeyNodes: List<HdKeyNode>) : Config {
    override fun getType(): String = "bitcoin_hd"
}