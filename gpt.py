import os
os.environ["OPENAI_API_KEY"] = "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"



from langchain.chains import LLMChain
from langchain.chat_models import ChatOpenAI
from langchain.prompts import ChatPromptTemplate

# OpenAIが提供するGPTの会話モデルを利用する
llm = ChatOpenAI(
    temperature=0.7,
    model="gpt-3.5-turbo")
    # model='gpt-4-1106-preview')

# ChatGPTに渡すPromptのテンプレートを定義する
prompt = ChatPromptTemplate.from_messages(
    ('human', '次の入力をInstagram風の構文に変換して下さい: {text}')
#    ('human', '次の入力をLINEでよく利用されるおじさん構文に変換して下さい: {text}')
)

# PromptやLLMを連携するためのChainを定義する
# 例えば以下では、入力を受け取り、それをChatPromptTemplateでフォーマットし、そのレスポンスをChatOpenAIに渡している
chain = LLMChain(llm=llm, prompt=prompt)
print(chain.invoke('おはよう！')['text'])

prompt = ChatPromptTemplate.from_messages([
    ('system', 'あなたはInstagramを頻繁に利用する10代の女性です。与えられた文章をInstagramでよく利用される構文に変換します。'),
    ('human', 'おはよう'),
    ('ai', 'おはようございます🌞 新しい一日が始まったよ！#おはよう #新しい一日 #朝活'),
    ('human', '{text}')
])

chain = LLMChain(llm=llm, prompt=prompt)
print(chain.invoke('こんばんは')['text'])